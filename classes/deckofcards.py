import random

class Card(object):
    suites = ['Clubs', 'Diamond', 'Hearts', 'Spades']
    ranks = ['0','Ace', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'Joker',
            'Queen', 'King' ]

    def __init__(self, suite = None, rank = None):
        self.suite = suite
        self.rank = rank

    def __str__(self):
        return '('+ self.suites[self.suite]+ ',' + self.ranks[self.rank] +')'

    def __eq__(self, other):
        if self.suite == other.suite and self.rank == other.rank:
            return 1
        else:
            return 0
        


class Deck():
    def __init__(self):
        self.cards = []
        for i in range(0,4):
            for j in range(1,14):
                self.cards.append(Card(i, j))

    def __str__(self):
        s = ''
        for i in range(len(self.cards)):
            s += ' '*i +'Card:'+ str(self.cards[i]) + '\n'
        return s

    def shuffle(self):
        length = len(self.cards)
        for i in range(0, length):
            j = random.randrange(i, length)
            self.cards[i], self.cards[j] = self.cards[j], self.cards[i]
            
    def remove(self, card):
        if card in self.cards:
            self.cards.remove(card)
            return True
        else:
            return False
    def is_empty(self):
        return True if len(self.cards)==0 else False
    def pop(self):
        return self.cards.pop()

    def deal(self, hands, num_cards = 999):
        length = len(self.cards)
        for i in range(0, num_cards):
            if self.is_empty():
                break
            number_players = len(hands)
            current_player = hands[i % number_players]
            current_player.add(self.pop())
        




class Hand(Deck):
    def __init__(self, name = ''):
        self.cards = []
        self.name = name
        
    def add(self, card):
        self.cards.append(card)

    def __str__(self):

        s = 'Hand ' + self.name
        
        if self.is_empty():
            s += ' Is empty'
        else:
            s += ' contains\n'
        s += Deck.__str__(self)
        return s
        #return self.name + '\n' + super(Hand, self).__str__()

class OldMaidHand(Hand):
    def remove_matches(self):

        copy = self.cards[:]
        total = 0
        for card in copy:
            match = Card(3- card.suite, card.rank)
            if match in self.cards:
                self.cards.remove(match)
                self.cards.remove(card)
                total += 1
                print('Hand %s: %s match %s'%(self.name,card, match ))
        return total


class CardGame(object):
    def __init__(self, deck = None):
        self.deck = Deck()
        self.deck.shuffle()


class OldMaidGame(CardGame):
    def play(self, names):

        ##Remove the Queen of Clubs

        self.deck.remove(Card(0, 12))
        self.hands = []
        
        
        ###Adding all the names
        for name in names:
            self.hands.append(OldMaidHand(name))
    

        ##Distribute the Cards to the Players

        self.deck.deal(self.hands)
        self.print_hands()
        print(len(self.deck.cards))

        ##Remove all the matches

        matches = self.remove_all_matches(self.hands)

        ###Game can be started

        print('Game starts')
        
        MAX_MATCHES = 25
        turn = 0
        total = len(self.hands)
        
        while matches < 25:
            current_player = turn
            matches += self.play_next_turn(current_player)
            turn = (turn + 1) % total
        self.print_hands()
        self.declare_loser()




    def remove_all_matches(self, hands):
        count = 0
        for hand in hands:
            count += hand.remove_matches()
        return count
    

    def play_next_turn(self, current_player_index):
        #Since I will be req the hands reference its good to have this
        #function here

        total = len(self.hands)
        count = 0
        current = self.hands[current_player_index]
        
        if current.is_empty():
            return 0
        else:
            #Look for a neighbour
            neighbour = self.find_neighbour(current_player_index)
            if not neighbour.is_empty():
                picked_card = neighbour.pop()
                if picked_card:
                    current.add(picked_card)
                    print ("Hand", self.hands[current_player_index].name, "picked", picked_card)
                    count = current.remove_matches()
                    current.shuffle()
                    return count
                else:
                    return 0
            else:
                return 0
            
    def find_neighbour(self, current_player_index):

        total = len(self.hands)
        for i in range(1,total):
            neighbour_index = (current_player_index + i) % total
            if not self.hands[neighbour_index].is_empty():
                return self.hands[neighbour_index]

    def print_hands(self):
        s = ''
        for hand in self.hands:
            s += 'Hand of ' + hand.name + '\n'
            s += OldMaidHand.__str__(hand) + '\n'
        print(s)
    def declare_loser(self):
        for hand in self.hands:
            if not hand.is_empty():
                print('Player '+ hand.name + ' Lost the Game')
                break
        
        
        
        

game = OldMaidGame()
game.play(['Rahul', 'Teena', 'Manu', 'Radhika'])










