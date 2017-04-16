
from collections import defaultdict
from random import randint
import math

class popo:
    
    def __init__(self, tag, content):
        self.tag = tag
        self.content = content
        
class distribution_spread:
    
    def __init__(self, array, tag):
        self.count = len(array)
        self.sorted = self.sort_array(array, tag)
                
    def sort_array(self, array, tag):
        d = defaultdict(list)
        for obj in array:
            key = getattr(obj, tag)
            d[key].append(obj)
        return d
        
    def simple_spread(self):
        d = defaultdict(list)
        for key in self.sorted:
            dist = self.dist_points(self.sorted[key])
            for item in self.sorted[key]:
                d[next(dist)].append(item)
        return self.flat(d)
        
    def flat(self, dictionary):
        flat = []
        for key in dictionary:
            for obj in dictionary[key]:
                flat.append(obj)
        return flat
        
    def dist_points(self, array):
        offset = self.count / len(array)
        for i in range(len(array)):
            end = math.floor( (i+1) * offset )
            beg = end - math.floor(offset) + 1 
            yield randint(beg, end) - 1 #random index

objs = []
alpha = ['a','b','c','a','a','a']
for num in range(100):
    al = alpha[randint(0, len(alpha)-1)]
    objs.append(popo(al, al))

a = distribution_spread(objs, 'tag').simple_spread()

for idx in a:
    print(idx.tag)
