public ArrayList<Match> buildMatches() {
  ArrayList<Match> list = new ArrayList<Match>();
  int odd = 0;
  if (!(competitorList.size() % 2 == 0)) {
    odd++;
  }
  for (int i = 0; i < competitorList.size(); i++) {
    list.add(new Match(competitorList.get(i + odd), competitorList.get(i-competitorList.size()-1));
  }
  return list;
}
