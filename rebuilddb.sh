#!/bin/bash

MYSQL='mysql --default-character-set UTF8 -uroot '
DB=demo
$MYSQL -e "drop database if exists $DB"
$MYSQL -e "create database $DB default character set utf8 default collate utf8_general_ci"

for sql in `find db -iname '*sql'|sort`
do
  echo "load $sql"
  $MYSQL $DB <$sql
done
