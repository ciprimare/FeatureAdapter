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
package com.groupon.featureadapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil.DiffResult;
import java.util.List;

public class FeatureUpdate {
  @NonNull public final FeatureController featureController;
  @Nullable public final List<ViewItem> newItems;
  @Nullable public final DiffResult diffResult;

  public FeatureUpdate(
      @NonNull FeatureController featureController,
      @Nullable List<ViewItem> newItems,
      @Nullable DiffResult diffResult) {
    this.featureController = featureController;
    this.newItems = newItems;
    this.diffResult = diffResult;
  }
}
