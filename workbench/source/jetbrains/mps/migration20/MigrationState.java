/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps.migration20;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import jetbrains.mps.migration20.MigrationState.MyState;

@State(
  name = "MigrationState",
  storages = {
    @Storage(
      id = "other",
      file = "$APP_CONFIG$/MigrationState.xml"
    )
  }
)
public class MigrationState implements PersistentStateComponent<MyState> {
  private MState myState = MState.INITIAL;

  public MState getMigrationState() {
    return myState;
  }

  public void setMigrationState(MState state) {
    myState = state;
  }

  public MyState getState() {
    MyState state = new MyState();
    state.myState = myState.toInt();
    return state;
  }

  public void loadState(MyState state) {
    myState = MState.fromInt(state.myState);
  }

  public static class MyState {
    public int myState;
  }
}
