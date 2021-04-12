use std::collections::HashMap;
use std::cmp::max;

fn main() {
    let n: i32 = parse_line();
    let mut hmap = HashMap::new();
    let mut max_value = 0;
    for _i in 0..n {
        let si: String = parse_line();
        let count = hmap.entry(si).or_insert(0);
        *count += 1;
        max_value = max(max_value, *count);
    }

    let mut ans = vec![];
    for (k, &v) in &hmap {
        if v == max_value {
            ans.push(k);
        }
    }
    ans.sort();
    for a in ans {
        println!("{}", a);
    }
}

fn parse_line<T: std::str::FromStr>() -> T {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf.trim_end().parse().ok().unwrap()
}
