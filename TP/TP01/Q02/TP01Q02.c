#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool ehPalindromo(char palavra[])
{
  int tam = strlen(palavra) - 1;

  for (int i = 0; i <= tam; i++)
  {
    if (palavra[i] != palavra[tam - i])
      return false;
  }

  return true;
}

int main()
{
  char palavra[1000];

  scanf(" %[^\n\r]", palavra);

  while (strcmp(palavra, "FIM"))
  {
    if (ehPalindromo(palavra))
      printf("SIM\n");
    else
      printf("NAO\n");

    scanf(" %[^\n\r]", palavra);
  }

  return 0;
}