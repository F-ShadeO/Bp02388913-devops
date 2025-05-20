package bpp.com.devops;

import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NameManager {

    private final List<String> adjectives;

    private final List<String> animals;

    public NameManager() {

        adjectives = new ArrayList<>();
        adjectives.add("Secret");
        adjectives.add("Mighty");
        adjectives.add("Brave");
        adjectives.add("Swift");
        adjectives.add("Fierce");
        adjectives.add("Gentle");
        adjectives.add("Clever");
        adjectives.add("Bold");

        animals = new ArrayList<>();
        animals.add("Squirrel");
        animals.add("Tiger");
        animals.add("Eagle");
        animals.add("Wolf");
        animals.add("Fox");
        animals.add("Bear");
        animals.add("Panther");
        animals.add("Otter");


    }

    public void addAnimal(String animal) {
        this.animals.add(animal);
    }

    public void addAdjective(String adjective) {
        this.adjectives.add(adjective);
    }

    public String createName() {
        return randomise(adjectives) + " " + randomise(animals);
    }

    private String randomise(List<String> list) {
        int rand = RandomUtils.insecure().randomInt(0, list.size());
        return list.get(rand);
    }

}
