-module(ten).
-export([count/0]).

count(10) -> done;
count(N) -> io:format("~p~n", [N]), count(N+1).

count() -> count(0).