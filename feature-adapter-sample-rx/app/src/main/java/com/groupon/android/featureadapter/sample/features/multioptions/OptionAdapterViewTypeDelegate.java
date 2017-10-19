/*
 * Copyright (c) 2017, Groupon, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.groupon.android.featureadapter.sample.features.multioptions;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.groupon.android.featureadapter.sample.features.multioptions.state.OptionClickedEvent;
import com.groupon.android.featureadapter.sample.model.Option;
import com.groupon.android.featureadapter.sample.rx.R;
import com.groupon.featureadapter.AdapterViewTypeDelegate;

public class OptionAdapterViewTypeDelegate
    extends AdapterViewTypeDelegate<OptionAdapterViewTypeDelegate.OptionViewHolder, Option> {

  private static final int LAYOUT = R.layout.dd_option;

  @Override
  public OptionViewHolder createViewHolder(ViewGroup parent) {
    View view = LayoutInflater.from(parent.getContext()).inflate(LAYOUT, parent, false);
    return new OptionViewHolder(view);
  }

  @Override
  public void bindViewHolder(OptionViewHolder holder, Option model) {
    holder.valueText.setText(model.getTitle());
    holder.valueText.setOnClickListener(view -> fireEvent(new OptionClickedEvent(model)));
  }

  @Override
  public void unbindViewHolder(OptionViewHolder holder) {
    // no op
  }

  public class OptionViewHolder extends RecyclerView.ViewHolder {

    final TextView valueText;

    private OptionViewHolder(View itemView) {
      super(itemView);
      valueText = (TextView) itemView.findViewById(R.id.option_title_text);
    }
  }
}