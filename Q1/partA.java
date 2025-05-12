public int walkDogs(int hour) {
  int dawgs;
  if (company.availableDogs(hour) >= maxDogs)
    { dawgs = maxDogs; }
  else
    { dawgs = company.availableDogs(hour); }

  company.updateDogs(hour, dawgs);
  return dawgs;
}
