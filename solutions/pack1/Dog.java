package solutions.pack1;

public class Dog {
  public Breed breed;
  private int weight;

  Dog() {
    this.weight = 0;
  }

  public Dog(Breed breed, int weight) {
    this.weight = weight;
    this.breed = breed;
    // System.out.print("" + breed + " " + weight + " ");
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Dog [breed=" + breed + ", weight=" + weight + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((breed == null) ? 0 : breed.hashCode());
    result = prime * result + weight;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Dog other = (Dog) obj;
    if (breed != other.breed)
      return false;
    if (weight != other.weight)
      return false;
    return true;
  }
}
