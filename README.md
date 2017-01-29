# CardGame
This Card Game uses polymorphism. There are two games the player can choose from - BlackJack and Go Fish. Both games are
extend the abstract class, Game, which has a start() method. 

With polymorphism, we can create a Game reference that refers 
either to a Go Fish object or to a BlackJack object. The game gets started through the App engine. Here we create a reference
to a Game. The user is then asked to select a game and once they make the choice, either a new GoFish or a new BlackJack game
is created. The start() method is called on this new object and the object will run the loop appropriate to the type of game
object that was created.

GoFish: Each player is dealt 5 cards. Players take turns asking the other player for a given rank of card. If someone asks you for a rank that you have, the cards are taken from your hand. if you do not have any cards of that rank, your opponent must go fish, taking one new card from the pile of cards. When it’s your turn, select a player you think might have a needed card. Pick one card from your hand of the desired rank. If the player has the desired card, he or she must pass it over. If not, you must go fish. If you get the card you asked for, you get to go again. If you run out of cards and there are still cards left, you get five free cards. Play continues until all hands are empty and there are no more cards to draw from. The winner is the player with the most points at the end of the game.

No-wager BackJack: The first player is dealt two cards then is asked if they want to "Hit" or "Stay". The goal of the game is to get as close to 21 without going over. Once the first player stays, the second player is dealt two cards and they have the option of "Hit" or "Stay". Once both players end their turns, their respective card totals are shown.
