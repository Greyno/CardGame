# CardGame
This Card Game uses polymorphism. There are two games the player can choose from - BlackJack and Go Fish. Both games are
extend the abstract class, Game, which has a start() method. With polymorphism, we can create a Game reference that refers 
either to a Go Fish object or to a BlackJack object. Once the start() method is called on either object, the object will 
perform run it's game loop according to its own game rules.
