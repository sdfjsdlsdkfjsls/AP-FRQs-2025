public Round(String[] names) {
  ArrayList<Competitor> list = new ArrayList<Competitor>();
  int rank = 1;
  for (String name: names) {
    list.add(new Competitor(name, rank));
    rank++;
  }
  return list;
}
