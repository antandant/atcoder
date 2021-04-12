use std::collections::HashSet;

fn main() {
    let n: usize = {
    let mut line = String::new();
    std::io::stdin().read_line(&mut line).unwrap();
    line.trim().parse().unwrap()
    };
    let a: Vec<i64> = {
        let mut line = String::new();
        std::io::stdin().read_line(&mut line).unwrap();
        line.split_whitespace()
            .map(|x| x.parse().unwrap())
            .collect()
    };
    let mut hset: HashSet<i64> = HashSet::new();
    for ai in a {
        hset.insert(ai);
    }
    let ans = if hset.len() == n {
        "YES"
    } else {
        "NO"
    };
    println!("{}", ans);
}