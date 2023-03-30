class Solution
{
public int strStr(String haystack, String needle)
{
int needleLength = needle.length();
if (needleLength == 0)
{
return -1;
}
int haystackLength = haystack.length();
if(needleLength > haystackLength)
{
return -1;
}
for (int i = 0; i < haystackLength - needleLength + 1; i++)
{
if(haystack.substring(i, i + needleLength).equals(needle))
{
return i;
}
}
return -1;
}
}