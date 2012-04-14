-module(shop2).
-export([total/1]).

total([{A,N}|T]) -> prices:price(A) * N + total(T);
total([]) -> 0.

