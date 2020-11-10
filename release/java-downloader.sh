#!/usr/bin/env bash

# shellcheck disable=SC2046
export $(grep -v '^#' .env | xargs)

mv -e app-* app.jar 2>/dev/null

java -jar app.jar
