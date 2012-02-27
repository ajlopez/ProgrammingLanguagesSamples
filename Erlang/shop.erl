-module(shop).
-export([total/1]).

total([H|T]) -> prices:price(H) + total(T);
total([]) -> 0.

