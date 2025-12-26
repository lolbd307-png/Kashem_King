#!/usr/bin/env sh
DIR="$(cd "$(dirname "$0")" && pwd)"
exec java -Xmx1024m -jar "$DIR/gradle/wrapper/gradle-wrapper.jar" "$@"
