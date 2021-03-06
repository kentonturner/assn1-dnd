public abstract class Character implements Comparable<Character> {

  private int initiativeModifier;
  private int initiativeScore;
  private int hitPoints;
  private int attackModifier;
  private boolean defending;
  private String name;
  private DiceRoller roller;

  /**
   * Creates a character with the provided attributes.
   * @param initiativeModifier A character's initiative modifier gets added to the initiative roll.
   * @param hitPoints A character's hit points represent their health.
   * @param attackModifier A character's attack modifier is added to damage they deal on attacking.
   * @param name The name of the character you are creating.
   */
  public Character(int initiativeModifier, int hitPoints, int attackModifier, String name) {
    this.initiativeModifier = initiativeModifier;
    this.hitPoints = hitPoints;
    this.attackModifier = attackModifier;
    this.name = name;
    this.defending = false;
    this.initiativeScore = 0;
    this.roller = new DiceRoller();
  }

  public int getInitiativeScore() {
    return this.initiativeScore;
  }

  public int getHitPoints() {
    return this.hitPoints;
  }

  /**
   * This method checks whether or not this character is defending.
   * @return true if the character is defending, false otherwise.
   */
  public boolean isDefending() {
    return this.defending;
  }

  /**
   * Generates an initiative value for the current character.
   */
  public void getInitiative() {

  }

  /**
   * This method has the character perform an attack.
   * @return An integer representing the amount of damage dealt.
   */
  public int attack() {
    // Reset the defending flag, because we're no longer defending.
    this.defending = false;
    return 0;
  }

  /**
   * This method sets the character's defending flag to true, so damage may be halved.
   */
  public void defend() {

  }

  public void stopDefending() {

  }

  /**
   * This method updates a character's hitpoints depending on how much damage they've taken.
   * @param damage The amount of damage a character has sustained.
   */
  public void takeDamage(int damage) {
    // If we are defending, we take half damage rounded down, otherwise, we take full damage.
  }
}
