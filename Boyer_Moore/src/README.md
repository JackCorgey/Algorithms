# BOYER MOORE STRING SEARCH

### Brief description

##### If you're looking to find a string buried in a mountain of text, the Boore-Moore algorithm is your shovel.

#### But let's start out with something simpler, something brute forced
#### Take for instance the following string, the *haystack*.

> rute forcebrute forcbrute force

#### Within the haystack we want to search for a smaller string, the *needle*.

> brute force

##### The brute force approach would be to line the haystack and needle where the first index of the characters line up

###### rute forcebrute forcbrute force
###### brute force

##### and move the needle up one character until a match is found

rute forcebrute forcbrute force<br>
brute force<br>
 brute force<br>
  brute force<br>
   brute force<br>
    brute force<br>
    ... many more times<br>
                                  brute force
##### A match was found at character 20, assuming we start at 0.


