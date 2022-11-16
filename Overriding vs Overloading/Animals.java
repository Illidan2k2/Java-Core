 class Animal {
    //Final and static can be overloaded but cannot be overridden
    public void Sound(){
        System.out.println("Meow");
    }

    public void Sound(String pitch){
        System.out.println("Meow"+pitch);
    }

    public void Sound(String type, String frequency){
        System.out.println("Type: "+type+" ;Repeated rate: "+frequency);
    }

    public static void main(String[] args) {
        Animal animals = new Animal();
        animals.Sound();
        animals.Sound("Grrrr");
        animals.Sound("Roar","100 Hz");
    }
}
