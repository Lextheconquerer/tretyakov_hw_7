 class Medic extends Hero {
    private int HealPoints;

    public void increaseExperience(){
        this.HealPoints += HealPoints * 0.1;
        System.out.println("Medic увеличил кол-во единиц лечения");
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic вылечил команду");
    }
}


