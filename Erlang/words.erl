-module(words).
-export([count/1]).

count([], N) -> N + 1;
count([32,32|Tail], N) -> count([32|Tail], N);
count([32|Tail], N) -> count(Tail, N+1);
count([_|Tail], N) -> count(Tail, N).

count(List) -> count(List, 0).


