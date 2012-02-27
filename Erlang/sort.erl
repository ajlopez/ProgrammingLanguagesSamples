-module(sort).
-export([qsort/1]).

qsort([X|Xs]) -> 
    qsort([ Y || Y <- Xs, Y =< X]) ++ [X] ++ qsort([ Y || Y <- Xs, Y > X]);
qsort([]) -> [].

