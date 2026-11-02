//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<NeuralMod> modList = new ArrayList<>();

    modList.add(new NeuralMod("Apex-1", 4.2, 85));
    modList.add(new NeuralMod("Zenith-X", 5.8, 70));
    modList.add(new NeuralMod("Nova-Core", 4.2, 92));
    modList.add(new NeuralMod("Soma-Link", 3.1, 98));
    modList.add(new NeuralMod("Pulse-7", 5.8, 60));

    Collections.sort(modList);

    //Collections.sort(modList, (NeuralMod o1, NeuralMod o2) -> o1.getCompRating().compareTo(o2.getCompRating()));
    //Collections.reverse(modList);
    //for (NeuralMod m : modList) {
    //    System.out.println("Name: " + m.getName() + ", CompRating: " + m.getCompRating() + ", Speed: " + m.getProcSpeed());
    //}

    System.out.println(modList);
}
