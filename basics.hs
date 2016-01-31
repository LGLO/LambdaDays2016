module Basics where

higherOrder :: (a->b) -> (b->c) -> (a->c)
--higherOrder a b = \x -> b (a x)
--higherOrder a b = b . a
higherOrder a b x = b (a x)

listComprehension = [(a,b,c) | a<-[1..100], b<-[a..100], c<-[b..100], a*a+b*b == c*c]

laziness = [1..1000]

laziness2 = [1..]

patternMatching :: Either a b -> b -> b
patternMatching (Left x) b = b
patternMatching (Right a) _ = a

guards a
       | a < 0 = -1
       | a == 0 = 0
       | otherwise = 1

wheres a b x = b f
               where f = a (a x)

letExpr = let a = 10
              b = 20
                in a+b

doNotation = do
               a <- Just 1
               b <- Just (a*2)
               c <- Nothing
               Just (b+c)

-- The famous not so quick sort
qs :: Ord a => [a] -> [a]
qs [] = []
qs (x:xs) = qs [a | a<-xs, a < x] ++ [x] ++ qs [a | a<-xs, a>=x]
