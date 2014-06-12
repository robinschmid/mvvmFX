/*******************************************************************************
 * Copyright 2013 Alexander Casall
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.saxsys.jfx.mvvm.base.view;

import de.saxsys.jfx.mvvm.api.ViewModel;

/**
 *
 * This Interface is used as base interface for specific view types for mvvmfx.
 * The generic type defines the View Model that is used.

 * @author alexander.casall, manuel.mauky
 * 
 * @param <ViewModelType>
 *            type
 */
public interface View<ViewModelType extends ViewModel> {

}
