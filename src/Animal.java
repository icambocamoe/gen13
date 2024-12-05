abstract class Animal {
    abstract void comer();
    abstract void respirar();
}

class Perro extends Animal {
    @Override
    void comer() {
        System.out.println("El perro está comiendo.");
    }

    @Override
    void respirar() {
        System.out.println("El perro está respirando.");
    }
}

class Gato extends Animal {
    @Override
    void comer() {
        System.out.println("El gato está comiendo.");
    }

    @Override
    void respirar() {
        System.out.println("El gato está respirando.");
    }
}
