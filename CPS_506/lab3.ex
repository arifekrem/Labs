defmodule Lab3 do
  def firstTwo(list) do
    hd(list) == tl(list)
  end

  def evenSize(list) do
    rem(length(list), 2) == 0
  end

  def frontBack(list) do
    a = hd(list)
    list -- a
    list ++ a
  end

  def nextNineNine(list) do
    list = hd(list), 99, tl(list)
  end

  def isCoord(list) do
    length(list) == 2 and is_number(hd(list)) and is_number(tl(list))
  end

  def sayHello(list) do
    Enum.any?(list) == "Hello"
  end

  def helloIfSo(list) do
    if Enum.any?(list) == "Hello" do
      list -- "Hello"
      list ++ "Hello"
    else
      list ++ "Hello"
  end
end
