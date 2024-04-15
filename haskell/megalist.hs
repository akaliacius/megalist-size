{-# LANGUAGE NumericUnderscores #-}

main :: IO ()
main = print $ length [0 .. 1_000_000_000]
