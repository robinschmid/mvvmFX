/*******************************************************************************
 * Copyright 2015 Alexander Casall, Manuel Mauky
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
package de.saxsys.mvvmfx.scopes;


import de.saxsys.mvvmfx.FluentViewLoader;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScopeTest {

	@Test
	public void testJavaScopedView() throws Exception {

        final ScopedViewModelA viewModelA = FluentViewLoader.javaView(ScopedJavaViewA.class).load().getViewModel();
        final ScopedViewModelB viewModelB = FluentViewLoader.javaView(ScopedJavaViewB.class).load().getViewModel();

        verifyScopes(viewModelA, viewModelB);
	}

    @Test
    public void testFxmlScopedView() throws Exception {

        final ScopedViewModelA viewModelA = FluentViewLoader.fxmlView(ScopedFxmlViewA.class).load().getViewModel();
        final ScopedViewModelB viewModelB = FluentViewLoader.fxmlView(ScopedFxmlViewB.class).load().getViewModel();

        verifyScopes(viewModelA, viewModelB);
    }


    private void verifyScopes(ScopedViewModelA viewModelA, ScopedViewModelB viewModelB) {
        assertThat(viewModelA.injectedScope1).isNotNull();
        assertThat(viewModelA.injectedScope2).isNotNull();
        assertThat(viewModelA.injectedScope3).isNotNull();
        assertThat(viewModelA.lazyScope1).isNotNull();
        assertThat(viewModelA.lazyScope2).isNotNull();
        assertThat(viewModelA.lazyScope3).isNotNull();


        assertThat(viewModelA.injectedScope1).isEqualTo(viewModelA.lazyScope1);
        assertThat(viewModelA.injectedScope2).isEqualTo(viewModelA.lazyScope2);
        assertThat(viewModelA.injectedScope3).isEqualTo(viewModelA.lazyScope3);


        assertThat(viewModelB.injectedScope1).isNotNull();
        assertThat(viewModelB.injectedScope2).isNotNull();
        assertThat(viewModelB.injectedScope3).isNotNull();
        assertThat(viewModelB.lazyScope1).isNotNull();
        assertThat(viewModelB.lazyScope2).isNotNull();
        assertThat(viewModelB.lazyScope3).isNotNull();


        assertThat(viewModelB.injectedScope1).isEqualTo(viewModelB.lazyScope1);
        assertThat(viewModelB.injectedScope2).isEqualTo(viewModelB.lazyScope2);
        assertThat(viewModelB.injectedScope3).isEqualTo(viewModelB.lazyScope3);


        assertThat(viewModelA.injectedScope1).isEqualTo(viewModelB.injectedScope1);
        assertThat(viewModelA.injectedScope2).isEqualTo(viewModelB.injectedScope2);
        assertThat(viewModelA.injectedScope3).isEqualTo(viewModelB.injectedScope3);
        assertThat(viewModelA.lazyScope1).isEqualTo(viewModelB.lazyScope1);
        assertThat(viewModelA.lazyScope2).isEqualTo(viewModelB.lazyScope2);
        assertThat(viewModelA.lazyScope3).isEqualTo(viewModelB.lazyScope3);
    }


}
