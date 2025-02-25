/*
 * Tencent is pleased to support the open source community by making QMUI_Android available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the MIT License (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://opensource.org/licenses/MIT
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qmuiteam.qmui.arch.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * used for activity for different business.
 *
 *example:
 *
 * FragmentContainerParam(required = {"bookId"})
 * class BookActivity extend QMUIFragmentActivity {
 *
 * }
 *
 * FragmentScheme(name = "bookDetail", activities = {BookActivity.class}, required={"bookId"})
 * class BookDetailFragment extend QMUIFragment {
 *
 * }
 *
 * FragmentScheme(name = "bookRead", activities = {BookActivity.class}, required={"bookId"})
 * class BookReadFragment extend QMUIFragment {
 *
 * }
 *
 * if bookId changed. QMUI will start up a new activity. so it's safe to put common book info
 * in activityViewModel.
 *
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FragmentContainerParam {
    String[] required() default {};
    String[] optional() default {};
}
