fn main() {
    let w: i32 = parse_line();
    let word = "DiscoPresentsDiscoveryChannelProgrammingContest2016";
    let mut res = vec![];
    for i in 0..((word.len() as i32) / w + 1) {
        let mut line = String::from("");
        for (j, c) in word.chars().enumerate() {
            if i * w <= (j as i32) && (j as i32) < i * w + w {
                line.push(c);
            }
        }
        res.push(line);
    }
    for l in res.iter() {
        if l.len() > 0 {
            println!("{}", l);
        }
    }
}

fn parse_line<T: std::str::FromStr>() -> T {
    let mut buf = String::new();
    std::io::stdin().read_line(&mut buf).unwrap();
    buf.trim_end().parse().ok().unwrap()
}
