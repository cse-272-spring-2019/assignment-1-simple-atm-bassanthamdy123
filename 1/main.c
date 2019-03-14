#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* create_string (char ch, int n)
{
  char * dest = malloc(n+1);
  memset(dest, c, n);
  dest[n] = '\0';
  return dest;
}

int main() {
  char * result = char_repeat('*', 5);
  puts(result);
  free(result);
  return 0;
}
