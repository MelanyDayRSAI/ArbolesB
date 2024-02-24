package Tarea1P3;

import java.util.ArrayList;

public class Tarea1 {
	public Tarea1() {
	}
		
		private ArrayList<Object> filo = new ArrayList();
		
		public void push (Object o) {
			filo.add(o);
		}
        public Object peek() {
			if(!(filo.isEmpty())) {
				return filo.get(filo.size()-1);
			}else {
				return null;
			}
		}
        public Boolean empty() {
        	return filo.isEmpty();
        }
	}
 

