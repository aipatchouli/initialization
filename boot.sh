#!/bin/bash

cat > /etc/hostname << EOF
ysq
EOF



apt update && apt full-upgrade -y

cat > /etc/apt/sources.list << EOF
deb http://deb.debian.org/debian buster main contrib non-free
deb-src http://deb.debian.org/debian buster main contrib non-free
deb http://security.debian.org/debian-security buster/updates main contrib
deb-src http://security.debian.org/debian-security buster/updates main contrib
EOF

apt update && apt full-upgrade -y
apt install git wget curl gcc make screen glances g++ gcc cmake neofetch htop -y



