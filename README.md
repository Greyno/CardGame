# CardGame
This Card Game uses polymorphism. There are two games the player can choose from - BlackJack and Go Fish. Both games are
extend the abstract class, Game, which has a start() method. 

With polymorphism, we can create a Game reference that refers 
either to a Go Fish object or to a BlackJack object. The game gets started through the App engine. Here we create a reference
to a Game. The user is then asked to select a game and once they make the choice, either a new GoFish or a new BlackJack game
is created. The start() method is called on this new object and the object will run the loop appropriate to the type of game
object that was created.
