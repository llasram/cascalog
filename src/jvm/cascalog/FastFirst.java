/*
    Copyright 2010 Nathan Marz
 
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
 
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
 
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package cascalog;

import cascading.operation.Buffer;
import cascading.operation.BufferCall;
import cascading.flow.FlowProcess;
import cascading.tuple.Fields;
import cascading.tuple.TupleEntry;
import cascading.operation.BaseOperation;
import java.util.Iterator;

public class FastFirst extends BaseOperation implements Buffer {  

  public FastFirst() {
    super(Fields.ARGS);
  }
  

  public void operate(FlowProcess flowProcess, BufferCall bufCall) {
      bufCall.getOutputCollector().add(((Iterator<TupleEntry>)bufCall.getArgumentsIterator()).next());
  }
}