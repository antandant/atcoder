use proconio::input;
fn main() {
    input! {
        n: i32,
    }
    let mut sum = 0;
    for i in 1..10 {
        for j in 1..10 {
            sum += i*j;
        }
    }
    let rest = sum - n;
    let mut anss = Vec::new();
    for i in 1..10 {
        for j in 1..10 {
            if i * j == rest {
                anss.push(format!("{} x {}", i, j));
            }
        }
    }
    for elm in anss.iter() {
        println!("{}", elm);
    }
}
