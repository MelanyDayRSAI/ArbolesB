package Tarea1P3;

public class PrimCola {

	public PrimCola() {
	}
	public static void main(String[] args) {
     Colas1 cola = new Colas1 (4);
     cola.print();
     cola.remove();
     cola.insert("Gatukiis");
     cola.insert(3);
     cola.insert("chihuahua");
     cola.insert(4);
     cola.insert(8);
	}

}
