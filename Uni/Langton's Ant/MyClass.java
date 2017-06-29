package edu.kit.informatik;

public final class MyClass {

private MyClass() {

}
public static void main(String[] args) {



Simulation sim = new Simulation();
Board b;
b = sim.createBoard(args[0]);
sim.run(b);


}
}