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
            s += ' '*i + str(self.cards[i]) + '\n'
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

        
    
                
        


my_deck = Deck()
print(my_deck)
my_deck.shuffle()
print(my_deck.remove(Card(2,1)))
print(len(my_deck.cards))
print(Card(2,1)==Card(2,1))
print(my_deck.is_empty())
print(my_deck.pop())






