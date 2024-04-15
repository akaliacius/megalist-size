fn main() {
    let mut list = Vec::new();

    for i in 0..=1_000_000_000 {
        list.push(i);
    }

    println!("{}", list.len());
}
