package com.tts;

public class Pet {
    //    Pet class and variables

        private String name;
        private int age;
        private String location;
        private String type;

        //empty constructors
        public Pet() {
            name = "";
            age = 0;
            location = "";
            type = "";
        }
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    //code accessing Get Methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    //code accessing Set Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}



