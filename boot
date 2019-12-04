#!/bin/bash

apt update && apt full-upgrade -y

cat > /etc/apt/sources.list << EOF
deb http://deb.debian.org/debian buster main contrib non-free
deb-src http://deb.debian.org/debian buster main contrib non-free
deb http://security.debian.org/debian-security buster/updates main contrib
deb-src http://security.debian.org/debian-security buster/updates main contrib
EOF

apt update && apt full-upgrade -y
apt install git wget curl gcc make lrzsz screen htop g++ cmake -y

wget --no-check-certificate -q -O bbr2.sh "https://raw.githubusercontent.com/yeyingorg/bbr2.sh/master/bbr2.sh" && chmod +x bbr2.sh && bash bbr2.sh auto

