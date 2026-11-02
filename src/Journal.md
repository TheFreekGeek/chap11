Phase 1
Created class for the mods. Created an array list to hold list of mods. Added toString to format the output of the arraylist. We use an arraylist because it can grow dynamically with changes in the mods.

Phase 2
Added sort capability. Added some formatting to the toString. A natural order sorts based on standard terms and places the items in an automatic order. The comparable interface adds the code needed to sort items, other than objects, based on standard criteria.

Phase 3
Using Comparator lets you select custom sorting, beyond defaults. Use this when you want to select customer criteria. It took me a little bit to figure out a way to reverse it. I ended up using Collections.reverse after Collections.sort.

Phase 4
I did an if statement sorting speed. Then for the else I did an if statement sorting compatibility. Then lastly a compareTo on name. The logic works out to if speed matches go to compatibility. If that matches as well go to name.
