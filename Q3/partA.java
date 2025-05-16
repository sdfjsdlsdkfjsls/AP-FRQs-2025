public Round(String[] names) {
  competitorList = new ArrayList<Competitor>();
  int rank = 1;
  for (String name: names) {
    competitorList.add(new Competitor(name, rank));
    rank++;
  }
}
