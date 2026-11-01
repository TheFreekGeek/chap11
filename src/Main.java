//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<NeuralMod> modList = new ArrayList<>();
    NeuralMod mod1 = new NeuralMod("Apex-1", 4.2, 85);
    modList.add(mod1);
    NeuralMod mod2 = new NeuralMod("Zenith-X", 5.8, 70);
    modList.add(mod2);
    NeuralMod mod3 = new NeuralMod("Nova-Core", 4.2, 92);
    modList.add(mod3);
    NeuralMod mod4 = new NeuralMod("Soma-Link", 3.1, 98);
    modList.add(mod4);
    NeuralMod mod5 = new NeuralMod("Pulse-7", 5.8, 60);
    modList.add(mod5);
    System.out.println(modList);
}
