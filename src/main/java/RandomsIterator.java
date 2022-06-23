import java.util.Iterator;

public class RandomsIterator implements Iterator<Integer> {
    private Randoms randomIterator;
    private int randomNumber;

    public RandomsIterator(Randoms randomIterator) {
        this.randomIterator = randomIterator;
    }

    @Override
    public boolean hasNext() {
        if (randomNumber >= randomIterator.min && randomNumber <= randomIterator.max || randomNumber < randomIterator.min) {
            return true;
        }
        return false;
    }

    @Override
    public Integer next() {
        int min = randomIterator.min;
        int max = randomIterator.max - randomIterator.min;
        this.randomNumber = (int) (Math.random() * ++max) + min;
        return randomNumber;
    }
}
