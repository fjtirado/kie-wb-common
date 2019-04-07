/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
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

package org.kie.workbench.common.stunner.cm.backend.dataproviders;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

// TODO: (Submarine)

@Ignore
@RunWith(MockitoJUnitRunner.class)
public class CaseCalledElementFormProviderTest {

    /*private static final String ID1 = "P1.Process1";
    private static final String ID2 = "P1.Process2";
    @Mock
    FormRenderingContext context;
    @Mock
    RefactoringQueryService queryService;
    @Mock
    Path path1;
    @Mock
    Path path2;
    private CaseCalledElementFormProvider tested = new CaseCalledElementFormProvider();

    @Before
    @SuppressWarnings("unchecked")
    public void setup() {
        tested.setQueryService(queryService);
        List<RefactoringPageRow> results = new ArrayList<>();
        RefactoringMapPageRow refactoringMapPageRow = new RefactoringMapPageRow();
        Map<String, Path> map = new HashMap<>();
        map.put(ID1, path1);
        map.put(ID2, path2);
        refactoringMapPageRow.setValue(map);
        results.add(refactoringMapPageRow);

        when(queryService.query(eq(tested.getQueryName()),
                                anyObject())).thenAnswer(invocation -> {
            Set<ValueIndexTerm> terms = invocation.getArgumentAt(1, Set.class);

            if (terms.stream().anyMatch(t -> tested.getProcessIdResourceType().toString().equals(t.getTerm()))) {
                return results;
            }

            return null;
        });
    }

    @Test
    public void getBusinessProcessIDsTest() {
        Map<Object, String> results = tested.getBusinessProcessIDs();

        assertEquals(results.size(), 2);
        assertTrue(results.keySet().contains(ID1));
        assertTrue(results.keySet().contains(ID2));
        assertEquals(results.get(ID1), ID1);
        assertEquals(results.get(ID1), ID1);
    }

    @Test
    public void getSelectorDataTest() {
        SelectorData selectorData = tested.getSelectorData(context);

        assertEquals(selectorData.getValues().size(),
                     2);
    }

    @Test
    public void testGetProcessIdResourceType() throws Exception {
        assertEquals(tested.getProcessIdResourceType(), ResourceType.BPMN_CM);
    }

    @Test
    public void testGetQueryName() throws Exception {
        assertEquals(tested.getQueryName(), FindCaseManagementIdsQuery.NAME);
    }*/
}