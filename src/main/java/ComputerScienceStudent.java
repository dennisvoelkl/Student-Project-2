/*
1. Lege eine Klasse ComputerScienceStudent an und lasse diese von deiner Student-Klasse erben.
2. Füge deinem ComputerScienceStudent eine zusätzliche Eigenschaft hinzu.
3. Instanziere einen ComputerScienceStudent und gib ihn aus.
 */
public abstract class ComputerScienceStudent extends Student{
    private Boolean hasLongHair = false;
    private Boolean lovesComputerGames = true;

    public Boolean getHasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(Boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "hasLongHair=" + hasLongHair +
                ", lovesComputerGames=" + lovesComputerGames +
                "} " + super.toString();
    }

    public abstract String gender();

}
